package io.github.tubean.myspringcrud.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity(name = "user_image")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate

public class UserImage {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private int id;
    @Column()
    private String image;
    @Column()
    private String create_date;
    @Column()
    private String user_id;
}
