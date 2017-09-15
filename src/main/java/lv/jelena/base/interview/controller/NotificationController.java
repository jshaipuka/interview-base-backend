package lv.jelena.base.interview.controller;

import lv.jelena.base.interview.model.Notification;
import lv.jelena.base.interview.workflow.CreateNotificationWorkflow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class NotificationController {

    private final CreateNotificationWorkflow notificationWorkflow;

    @Autowired
    public NotificationController(final CreateNotificationWorkflow notificationWorkflow) {
        this.notificationWorkflow = notificationWorkflow;
    }

    @RequestMapping(method = POST, path = "/notifications")
    public void createNotification(@RequestBody final Notification notification) {
        notificationWorkflow.createEvent(notification);
    }
}
