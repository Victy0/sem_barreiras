package com.uff.sem_barreiras.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="deficiencia")
@Data
public class Deficiencia{
   
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id;
    
    @Column( name = "descricao" )
    private String descricao;
    
    @Column( name = "necessidade_rampa" )
    private Boolean necessidadeRampa;
    
    @Column( name = "necessidade_piso_tatel" )
    private Boolean necessidadePisoTatel;
    
    @Column( name = "necessidade_sonora" )
    private Boolean necessidadeSonora;
    
    @ManyToMany
    @JoinTable( name = "candidato_x_deficiencia", joinColumns = @JoinColumn( name = "id_deficiencia" ), inverseJoinColumns = @JoinColumn( name = "id_candidato" ) )
    private List<Candidato> candidatos;
    
    @ManyToMany
    @JoinTable( name = "vaga_x_deficiencia", joinColumns = @JoinColumn( name = "id_deficiencia" ), inverseJoinColumns = @JoinColumn( name = "id_vaga" ) )
    private List<Vaga> vagas;
}
