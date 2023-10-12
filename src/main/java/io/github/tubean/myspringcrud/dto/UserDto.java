package io.github.tubean.myspringcrud.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private String image;
    private String createDate;
    private String name;
    private String email;
    private String phone;


}
