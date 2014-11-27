package talk.thedamfr.com.androidwearnotification;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.View;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        findViewById(R.id.classicNotif).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicNotif();
            }
        });

        findViewById(R.id.swagNotif).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swagNotif();
            }
        });
        findViewById(R.id.swagerNotif).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swaggerNotif();
            }
        });
    }

    private void classicNotif() {
        int notificationId = 001;
        // Build intent for notification content
        Intent viewIntent = new Intent(this, MyActivity.class);
        PendingIntent viewPendingIntent =
                PendingIntent.getActivity(this, 0, viewIntent, 0);

        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentTitle("Titre")
                        .setContentText("Contenu")
                        .setContentIntent(viewPendingIntent)
                        .addAction(R.drawable.powered_by_google_light,
                                "Powered By Google", viewPendingIntent);

        // Get an instance of the NotificationManager service
        NotificationManagerCompat notificationManager =
                NotificationManagerCompat.from(this);

        // Build the notification and issues it with notification manager.
        notificationManager.notify(notificationId, notificationBuilder.build());
    }

    public void swagNotif() {
        int notificationId = 002;

        // Gros Style pour Grosse Notification
        NotificationCompat.BigTextStyle bigStyle = new NotificationCompat.BigTextStyle();
        bigStyle.bigText("Contenu Super Long Bacon ipsum dolor sit amet tenderloin salami pig, fatback pastrami ham hock shoulder bacon t-bone pork meatball. Pancetta ham turkey shankle turducken jerky. Jowl spare ribs short ribs andouille tongue shoulder. Rump shoulder cow turducken, salami filet mignon ham sausage pancetta pork prosciutto brisket short ribs boudin. Shoulder short ribs andouille swine venison ham hock.");



        // Build intent for notification content
        Intent viewIntent = new Intent(this, MyActivity.class);
        PendingIntent viewPendingIntent =
                PendingIntent.getActivity(this, 0, viewIntent, 0);

        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentTitle("Titre")
                        .setContentText("Contenu")
                        .setContentIntent(viewPendingIntent)
                        .addAction(R.drawable.powered_by_google_light,
                                "Powered By Google", viewPendingIntent)
                        .setStyle(bigStyle);

        // Get an instance of the NotificationManager service
        NotificationManagerCompat notificationManager =
                NotificationManagerCompat.from(this);

        // Build the notification and issues it with notification manager.
        notificationManager.notify(notificationId, notificationBuilder.build());
    }

    public void swaggerNotif() {
        int notificationId = 003;

        // Gros Style pour Grosse Notification
        NotificationCompat.BigTextStyle bigStyle = new NotificationCompat.BigTextStyle();
        bigStyle.bigText("Contenu Super Long Bacon ipsum dolor sit amet tenderloin salami pig, fatback pastrami ham hock shoulder bacon t-bone pork meatball. Pancetta ham turkey shankle turducken jerky. Jowl spare ribs short ribs andouille tongue shoulder. Rump shoulder cow turducken, salami filet mignon ham sausage pancetta pork prosciutto brisket short ribs boudin. Shoulder short ribs andouille swine venison ham hock.");


        // Ajoute un WearableExtender avec une GROSSE IMAGE
        NotificationCompat.WearableExtender wearableExtender =
                new NotificationCompat.WearableExtender()
                        .setBackground(BitmapFactory.decodeResource(getResources(), R.drawable.rsz_hipster));


        // Build intent for notification content
        Intent viewIntent = new Intent(this, MyActivity.class);
        PendingIntent viewPendingIntent =
                PendingIntent.getActivity(this, 0, viewIntent, 0);

        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentTitle("Titre")
                        .setContentText("Contenu")
                        .setContentIntent(viewPendingIntent)
                        .addAction(R.drawable.powered_by_google_light,
                                "Powered By Google", viewPendingIntent)
                        .setStyle(bigStyle)
                        .extend(wearableExtender);

        // Get an instance of the NotificationManager service
        NotificationManagerCompat notificationManager =
                NotificationManagerCompat.from(this);

        // Build the notification and issues it with notification manager.
        notificationManager.notify(notificationId, notificationBuilder.build());
    }
}
