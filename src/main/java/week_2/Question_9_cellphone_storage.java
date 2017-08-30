package week_2;

/**
 *
 A smartphone is running 3 apps, each of which syncs and download data from a different server.

 •	App A syncs and downloads data every hour, and downloads 0.5KB each time
 •	App B syncs and downloads daily, and downloads 2KB every time
 •	App C, when installed, is 1MB in size. This app syncs and downloads every 4 hours, and every time it syncs it
     downloads 1% of its current size. The new data it downloads count towards the app's size, so you'll need to
     keep track of the current size of the app.

 With all apps installed, the phone has 5MB of free space.
 When the phone starts, each app syncs and downloads, and then repeats to their own schedule.

 With all 3 apps running continuously, how long will it be before the phone runs out of space?

 Assume the phone is running continuously and nothing else is using space on the phone.
 Assume that 1KB = 1000 bytes and 1MB = 1000,000 bytes.

 Hint 1: the modulus operator is helpful. An expression like  ( number % 4 == 0 ) is true if number divides evenly by 4.
 Hint 2: the answer is several thousand hours.
 Hint 3: This problem is a little trickier than the other ones, but it can be done :)

 */
public class Question_9_cellphone_storage {

    public static void main(String[] args) {
        double hoursToFill = new Question_9_cellphone_storage().calculateTimeToFillPhone(5000,
                0.5, 2, 1, 1000);
        System.out.println(hoursToFill);
    }

    public double calculateTimeToFillPhone(int freeSpaceKB, double appAHourlyDownloadKB, double appBDailyDownloadKB,
                                           double appCPercentDownload, double appCSizeKB) {

        // TODO Calculate and return the number of hours until the phone runs out of space
        // Make sure all the apps sync and download at hour = 0
        // Use the method arguments.

        int hours = 0;



        return hours;  // TODO replace with your own calculated value

    }

}
