package io.github.tubean.myspringcrud.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "boardinghouse", schema = "spring_app", catalog = "")
public class BoardinghouseEntity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "typeHouse")
    private String typeHouse;
    @Basic
    @Column(name = "landLordName")
    private String landLordName;
    @Basic
    @Column(name = "createDate")
    private String createDate;

}
