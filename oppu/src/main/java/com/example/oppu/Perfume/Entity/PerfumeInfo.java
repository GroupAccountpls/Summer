package com.example.oppu.Perfume.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "PERFUME_INFO")
@Entity()
public class PerfumeInfo {

    @Id
    @Column(name = "PERFUME_NAME" , length=70, nullable = false)
    private String perfumeName;

    @Column(name = "GENDER", length=18)
    private String gender;

    @Column(name="BRAND" ,length=40, nullable = false)
    private String brand;

    @Column(name = "HAVE",length=9)
    private String have;

    @Column(name = "HAD" , length=9)
    private String had;

    @Column(name = "WANT" , length=9)
    private  String want;

    @Column(name = "LOVE" , length=9)
    private String love;

    @Column(name = "LIKES" , length=9)
    private String likes;

    @Column(name = "OK" , length=9)
    private String ok;

    @Column(name = "DISLIKE" , length=9)
    private String dislike;

    @Column(name = "HATE" , length=9)
    private String hate;

    @Column(name = "WINTER" , length=9)
    private String winter;

    @Column(name = "SPRING" , length=9)
    private String spring;

    @Column(name = "SUMMER" , length=9)
    private String summer;

    @Column(name = "FALL" , length=9)
    private String fall;

    @Column(name = "DAYS" , length=9)
    private String days;

    @Column(name = "NIGHT" , length=9)
    private String night;

    @Column(name = "ARTICLE" , length=700)
    private String article;

    @Column(name = "IMG" , length=74, nullable = false)
    private String img;


}