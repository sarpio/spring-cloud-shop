package Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "client")
public class ClientEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    @Type(type = "uuid-char")
    @ColumnDefault("random_uuid()")
    private UUID id;

    @NotNull
    @NotBlank
    @NotEmpty
    @Column(name = "first_name")
    private String first_name;

    @NotNull
    @NotBlank
    @NotEmpty
    @Column(name = "last_name")
    private String last_name;

    @NotNull
    @NotBlank
    @NotEmpty
    @Email
    @Column(name = "email")
    private String email;

    @NotNull
    @NotBlank
    @NotEmpty
    @Column(name = "login")
    private String login;

    @NotNull
    @NotBlank
    @NotEmpty
    @Column(name = "password")
    private String password;

}
