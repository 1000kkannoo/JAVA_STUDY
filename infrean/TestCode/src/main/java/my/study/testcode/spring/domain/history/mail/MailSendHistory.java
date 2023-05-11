package my.study.testcode.spring.domain.history.mail;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access =  AccessLevel.PROTECTED)
@Entity
public class MailSendHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fromEMail;
    private String toEmail;
    private String subject;
    private String content;

    @Builder
    private MailSendHistory(String fromEMail, String toEmail, String subject, String content) {
        this.fromEMail = fromEMail;
        this.toEmail = toEmail;
        this.subject = subject;
        this.content = content;
    }
}
