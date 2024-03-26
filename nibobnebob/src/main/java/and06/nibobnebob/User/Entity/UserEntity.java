package and06.nibobnebob.User.Entity;

import java.sql.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "User")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, unique = true)
    private String nickName;

    @Column(length = 50, unique = true)
    private String email;

    @Column(length = 11)
    private String birthdate;

    @Column(length = 20)
    private String region;

    @Column(nullable = false)
    private Boolean isMale;

    @Column(length = 62, nullable = true)
    private String password;

    @Column(length = 20, nullable = true)
    private String provider;

    @Column(length = 255, nullable = false, columnDefinition = "TEXT DEFAULT 'profile/images/defaultprofile.png'")
    private String profileImage;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleted_at;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;

}
