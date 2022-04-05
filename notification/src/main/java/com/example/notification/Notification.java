package com.example.notification;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Notification {

  @Id
  @SequenceGenerator(
      name = "notification_id_sequence",
      sequenceName = "notification_id_sequence",
      allocationSize = 1)
  @GeneratedValue(generator = "notification_id_sequence", strategy = GenerationType.SEQUENCE)
  private Integer notificationId;

  private Integer toCustomerId;
  private String toCustomerEmail;
  private String sender;
  private String message;
  private LocalDateTime sentAt;
}
