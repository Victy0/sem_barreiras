package com.uff.sem_barreiras.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;
import javax.mail.util.ByteArrayDataSource;

@Service
public class EmailService {
    
    /*private final String hostImap;
    private final String usernameImap;
    private final String passwordImap;
    private final int portImap;*/

	private final String hostSmtp;

	private final String passwordSmtp;

	private final String portSmtp;

	private final String usernameSmtp;

    public EmailService(
		@Value( "${smtp.username}" ) final String usernameSmtp,
		@Value( "${smtp.password}" ) final String passwordSmtp,
		@Value( "${smtp.host}" ) final String hostSmtp,
		@Value( "${smtp.port}" ) final String portSmtp,
		@Value( "${imap.username}" ) final String usernameImap,
		@Value( "${imap.password}" ) final String passwordImap,
		@Value( "${imap.host}" ) final String hostImap,
		@Value( "${imap.port}" ) final int portImap )
	{
		this.usernameSmtp = usernameSmtp;
		this.passwordSmtp = passwordSmtp;
		this.hostSmtp = hostSmtp;
		this.portSmtp = portSmtp;

		/*this.usernameImap = usernameImap;
		this.passwordImap = passwordImap;
		this.hostImap = hostImap;
		this.portImap = portImap;*/
    }

    public void enviar( final String to, final String subject, final String content )
	{
		final String from = this.usernameSmtp;

		final Properties props = System.getProperties();
		props.put( "mail.smtp.host", this.hostSmtp );
		props.put( "mail.smtp.port", this.portSmtp );
		props.put( "mail.smtp.auth", "true" );
		props.put( "mail.smtp.starttls.enable", "true" ); // TLS

		final String username = this.usernameSmtp;
		final String password = this.passwordSmtp;
		final Session session = Session.getInstance( props, new Authenticator()
		{

			@Override
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication( username, password );
			}
		} );

		try
		{
			final MimeMessage message = new MimeMessage( session );

			message.setFrom( new InternetAddress( from ) );

			message.addRecipient( Message.RecipientType.TO, new InternetAddress( to ) );

			message.setSubject( subject );

			message.setText( content );

			Transport.send( message );
		}
		catch ( final MessagingException e )
		{
			System.out.println("Erro e-mail:" + e.getMessage());
		}

	}

    //não está em uso
	private void sendWithAttachment(
		final String recipient,
		final String subject,
		final String content,
		final String fileName,
		final InputStream stream )
		throws IOException
	{
		// InputStream stream arquivo em forma de InputStream

		final String from = this.usernameSmtp;
		final String username = this.usernameSmtp;
		final String password = this.passwordSmtp;

		final Properties props = System.getProperties();
		props.put( "mail.smtp.host", this.hostSmtp );
		props.put( "mail.smtp.port", this.portSmtp );
		props.put( "mail.smtp.auth", "true" );
		props.put( "mail.smtp.starttls.enable", "true" );

		final Session session = Session.getInstance( props, new Authenticator()
		{

			@Override
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication( username, password );
			}
		} );

		try
		{

			final ZoneId zone = ZoneId.of( "America/Bahia" );
			final LocalDate local_Dt = LocalDate.now( zone );
			final LocalTime local_Time = LocalTime.now( zone );
			final LocalDateTime localDateTime = LocalDateTime.of( local_Dt, local_Time );

			final String localDateTimeAsStringForSubject = localDateTime
				.format( DateTimeFormatter.ofPattern( "dd-MM-yyyy hh:mm:ss a" ) );
			final String localDateTimeAsStringForAttachment = localDateTime
				.format( DateTimeFormatter.ofPattern( "dd-MM-yyyy_hh-mm" ) );

			final Message message = new MimeMessage( session );
			message.setFrom( new InternetAddress( from ) );
			message.addRecipient( Message.RecipientType.TO, new InternetAddress( recipient ) );
			message.setSubject( subject + " " + localDateTimeAsStringForSubject );

			final Multipart multipart = new MimeMultipart();

			final MimeBodyPart mainBodyPart = new MimeBodyPart();
			mainBodyPart.setText( content );

			multipart.addBodyPart( mainBodyPart );

			final MimeBodyPart attachmentBodyPart = new MimeBodyPart();
			final DataSource source = new ByteArrayDataSource( stream, "application/x-download" );

			attachmentBodyPart.setDataHandler( new DataHandler( source ) );
			attachmentBodyPart
				.setFileName(
					MimeUtility
						.encodeText( fileName + "_" + localDateTimeAsStringForAttachment + ".TIPO_ARQUIVO", "UTF-8", null ) );
			attachmentBodyPart.setDisposition( Part.ATTACHMENT );
			multipart.addBodyPart( attachmentBodyPart );
			message.setContent( multipart );

			Transport.send( message );

		}
		catch ( final MessagingException e )
		{
			e.printStackTrace();
		}
	}
	
}
