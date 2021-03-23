package com.uff.semBarreiras.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
@Table(name= "candidato")
public class Candidato implements Serializable {
    
    @Id
    @Column(name= "nome")
    @GeneratedValue( strategy = GenerationType.IDENTITY )    
    private Integer id ;

    @Column(name= "nome")
    private String nome ;

    @Column(name= "telefone")
    private String telefone ;

    @Column(name= "email")
    private String email ;

    @Column(name= "curriculo")
    private String curriculo ;

    @ManyToMany
    @JoinTable( name = "candidato_x_deficiencia", joinColumns = @JoinColumn( name = "id_candidato" ), inverseJoinColumns = @JoinColumn( name = "id_deficiencia" ) )
    private List<Deficiencia> deficiencias ;

    @ManyToOne
    @JoinColumn(name= "id_estado")
    private Estado estado ;

    @ManyToOne
    @JoinColumn(name="id_escolaridade")
    private Escolaridade escolaridade;

    @ManyToMany
    @JoinTable( name = "candidato_x_vaga", joinColumns = @JoinColumn( name = "id_candidato" ), inverseJoinColumns = @JoinColumn( name = "id_vaga" ) )
    private List<Vaga> vagas;
}
