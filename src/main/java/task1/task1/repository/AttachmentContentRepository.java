package task1.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import task1.task1.entity.AttachmentContent;

import java.util.Optional;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {

    Optional<AttachmentContent> findByAttachmentId(int attachment_id);
}
