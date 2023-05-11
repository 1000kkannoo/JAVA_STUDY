package my.study.testcode.spring.client.mail;

import my.study.testcode.spring.domain.history.mail.MailSendHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailSendHistoryRepository extends JpaRepository<MailSendHistory, Long> {
}
