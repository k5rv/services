package com.example.notification;

import com.example.clients.notification.NotificationRequest;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Data
public class NotificationService {

  private final NotificationRepository notificationRepository;

  public void send(NotificationRequest notificationRequest) {
    notificationRepository.save(
            Notification.builder()
                    .toCustomerId(notificationRequest.toCustomerId())
                    .toCustomerEmail(notificationRequest.toCustomerName())
                    .sender("Example project")
                    .message(notificationRequest.message())
                    .sentAt(LocalDateTime.now())
                    .build()
    );
  }
}
