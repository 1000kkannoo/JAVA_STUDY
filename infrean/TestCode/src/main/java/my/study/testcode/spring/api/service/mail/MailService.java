package my.study.testcode.spring.api.service.mail;

import lombok.RequiredArgsConstructor;
import my.study.testcode.spring.client.mail.MailSendClient;
import my.study.testcode.spring.client.mail.MailSendHistoryRepository;
import my.study.testcode.spring.domain.history.mail.MailSendHistory;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MailService {

    private final MailSendClient mailSendClient;
    private final MailSendHistoryRepository mailSendHistoryRepository;

    public boolean sendMail(String fromEmail, String toEmail, String subject, String content) {
        boolean result = mailSendClient.sendEmail(fromEmail, toEmail, subject, content);
        if (result) {
            mailSendHistoryRepository.save(MailSendHistory.builder()
                    .fromEMail(fromEmail)
                    .toEmail(toEmail)
                    .subject(subject)
                    .content(content)
                    .build()
            );
            return true;
        }

        return false;
    }
}
