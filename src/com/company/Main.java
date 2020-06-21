package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Classname: Main
 * @version 20.06.2020
 * @author Kopach Daria
 * <p>
 * Description:JavaCollectionsFramework. List.
 * <p>
 * <p>
 * 1.  Create ArrayList and LinkedList containing 10 000 Integer elements.
 * Compare time intervals.
 * 2. Insert new 100 elements on the beginning, on the middle and on the end
 * of ones. Compare time intervals.
 * 3. Update 100 elements  from the  beginning, from  the middle  and from
 * the end of ones. Compare time intervals.
 * 4. Delete 100 elements  from the  beginning, from  the middle  and from
 * the end of ones. Compare time intervals.
 *
 */

public class Main {

    /**
     * Method that is default entry point of a program.
     *
     * @param args String argument for main method.
     */

    public static void main(String[] args) {


        System.out.println("--Lists Creations--");

        //1.Create ArrayList containing 10 000 Integer elements.

        LocalDateTime arrayListStart = LocalDateTime.now();

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        LocalDateTime arrayListFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("Time for creating Array List is "
                + ChronoUnit.MILLIS.between(arrayListStart,
                arrayListFinish) + " Milliseconds");


        //1.Create LinkedList containing 10 000 Integer elements.

        LocalDateTime linkedListStartTime = LocalDateTime.now();

        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        LocalDateTime linkedListFinishTime = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("Time for creating Linked List is "
                + ChronoUnit.MILLIS.between(linkedListStartTime,
                linkedListFinishTime) + " Milliseconds");


        //2.1. Insert new 1000 elements on the beginning

        System.out.println("\n--Insert new 1000 elements on the beginning--");

        // add 1000 elements to beginning of Array List

        LocalDateTime arrayListAddToBeginStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i, i);
        }

        LocalDateTime arrayListAddToBeginFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To add 1000 elements in beginning of ArrayList needs "
                + ChronoUnit.MILLIS.between(arrayListAddToBeginStart,
                arrayListAddToBeginFinish) + " Milliseconds");


        // add 1000 elements to beginning of Linked List

        LocalDateTime linkedListAddToBeginStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(i, i);
        }
        LocalDateTime linkedListAddToBeginFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To add 1000 elements in beginning of LinkedList needs "
                + ChronoUnit.MILLIS.between(linkedListAddToBeginStart,
                linkedListAddToBeginFinish) + " Milliseconds");

        // 2.2. Insert new 1000 elements on the middle

        System.out.println("\n--Insert  new 1000 elements on the middle--");

        // Insert new 1000 elements on the middle of Array List

        LocalDateTime arrayListAddToMiddleStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(arrayList.size()/2 + i, i);
        }
        LocalDateTime arrayListAddToMiddleFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To add 1000 elements in the middle of ArrayList needs "
                + ChronoUnit.MILLIS.between(arrayListAddToMiddleStart,
                arrayListAddToMiddleFinish) + " Milliseconds");

        // Insert new 1000 elements on the middle of Linked List

        LocalDateTime linkedListAddToMiddleStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(50500 + i, i);
        }

        LocalDateTime linkedListAddToMiddleFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To add 1000 elements in the middle of LinkedList needs "
                + ChronoUnit.MILLIS.between(linkedListAddToMiddleStart,
                linkedListAddToMiddleFinish) + " Milliseconds");

        // 2.3. Insert new 1000 elements on the end

        System.out.println("\n--Insert  new 1000 elements on the end--");

        // Insert new 1000 elements on the end of Array List

        LocalDateTime arrayListAddToEndStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        LocalDateTime arrayListAddToEndFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To add 1000 elements in the end of ArrayList needs "
                + ChronoUnit.MILLIS.between(arrayListAddToEndStart,
                arrayListAddToEndFinish) + " Milliseconds");

        // Insert new 1000 elements on the end of Linked List

        LocalDateTime linkedListAddToEndStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }

        LocalDateTime linkedListAddToEndFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To add 1000 elements in the end of LinkedList needs "
                + ChronoUnit.MILLIS.between(linkedListAddToEndStart,
                linkedListAddToEndFinish) + " Milliseconds");


        //3.1. Update 1000 elements from the beginning. Compare time intervals.

        System.out.println("\n--Update 1000 elements from the beginning--");

        // Update 1000 elements from the beginning of ArrayList

        LocalDateTime arrayListUpdateBeginStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.set(i, i + 3);
        }

        LocalDateTime arrayListUpdateBeginFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To update 1000 elements from the beginning" +
                " of ArrayList needs " + ChronoUnit.MILLIS.between
                (arrayListUpdateBeginStart, arrayListUpdateBeginFinish) + " Milliseconds");

        // Update 1000 elements from the beginning of LinkedList

        LocalDateTime linkedListUpdateBeginStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.set(i, i + 3);
        }

        LocalDateTime linkedListUpdateBeginFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To update 1000 elements from the beginning" +
                " of LinkedList needs " + ChronoUnit.MILLIS.between
                (linkedListUpdateBeginStart, linkedListUpdateBeginFinish) + " Milliseconds");

        //3.2. Update 1000 elements  from the middle. Compare time intervals.

        System.out.println("\n--Update 1000 elements  on the  middle--");

        // Update 1000 elements from the middle of ArrayList

        LocalDateTime arrayListUpdateMiddleStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.set(51500 + i, i + 3);
        }

        LocalDateTime arrayListUpdateMiddleFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To update 1000 elements from the middle" +
                " of ArrayList needs " + ChronoUnit.MILLIS.between
                (arrayListUpdateMiddleStart, arrayListUpdateMiddleFinish)
                + " Milliseconds");

        // Update 1000 elements from the middle of LinkedList

        LocalDateTime linkedListUpdateMiddleStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.set(linkedList.size()/2 + i, i + 3);
        }

        LocalDateTime linkedListUpdateMiddleFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To update 1000 elements from the middle" +
                " of ArrayList needs " + ChronoUnit.MILLIS.between
                (linkedListUpdateMiddleStart, linkedListUpdateMiddleFinish)
                + " Milliseconds");

        //3.3. Update 1000 elements from the end. Compare time intervals.

        System.out.println("\n--Update 1000 elements  on the  end--");

        // Update 1000 elements from the end of ArrayList

        LocalDateTime arrayListUpdateEndStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.set(arrayList.size() - 1000 + i, i + 3);
        }

        LocalDateTime arrayListUpdateEndFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To update 1000 elements from the end" +
                " of LinkedList needs " + ChronoUnit.MILLIS.between
                (arrayListUpdateEndStart, arrayListUpdateEndFinish)
                + " Milliseconds");

        // Update 1000 elements from the end of LinkedList

        LocalDateTime linkedListUpdateEndStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.set(linkedList.size() - 1000 + i, i + 3);
        }

        LocalDateTime linkedListUpdateEndFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To update 1000 elements from the end" +
                " of LinkedList needs " + ChronoUnit.MILLIS.between
                (linkedListUpdateEndStart, linkedListUpdateEndFinish)
                + " Milliseconds");


        //4.1. Delete 1000 elements from the  beginning. Compare time intervals.

        System.out.println("\n--Delete 1000 elements from the  beginning--");

        // Delete 1000 elements  from the  beginning of ArrayList

        LocalDateTime arrayListDeleteBeginStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(i);
        }

        LocalDateTime arrayListDeleteBeginFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To delete 1000 elements from the beginning" +
                " of ArrayList needs " + ChronoUnit.MILLIS.between
                (arrayListDeleteBeginStart, arrayListDeleteBeginFinish)
                + " Milliseconds");

        // Delete 1000 elements from the beginning of LinkedList

        LocalDateTime linkedListDeleteBeginStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(i);
        }
        LocalDateTime linkedListDeleteBeginFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To delete 1000 elements from the beginning" +
                " of LinkedList needs " + ChronoUnit.MILLIS.between
                (linkedListDeleteBeginStart, linkedListDeleteBeginFinish)
                + " Milliseconds");

        //4.2. Delete 1000 elements from the middle. Compare time intervals.

        System.out.println("\n--Delete 1000 elements from the  middle--");

        // Delete 1000 elements from the middle of ArrayList

        LocalDateTime arrayListDeleteMiddleStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size()/2 + i);
        }

        LocalDateTime arrayListDeleteMiddleFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To delete 1000 elements from the middle" +
                " of ArrayList needs " + ChronoUnit.MILLIS.between
                (arrayListDeleteMiddleStart, arrayListDeleteMiddleFinish)
                + " Milliseconds");

        // Delete 1000 elements from the middle of LinkedList

        LocalDateTime linkedListDeleteMiddleStart = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size()/2 + i);
        }

        LocalDateTime linkedListDeleteMiddleFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To delete 1000 elements from the middle" +
                " of LinkedList needs " + ChronoUnit.MILLIS.between
                (linkedListDeleteMiddleStart, linkedListDeleteMiddleFinish)
                + " Milliseconds");


        //4.3. Delete 1000 elements from the end. Compare time intervals.

        System.out.println("\n--Delete 100 elements from the  end--");

        // Delete 1000 elements from the end of ArrayList

        LocalDateTime arrayListDeleteEndStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() - 1000 + i);
        }

        LocalDateTime arrayListDeleteEndFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To delete 1000 elements from the end" +
                " of ArrayList needs " + ChronoUnit.MILLIS.between
                (arrayListDeleteEndStart, arrayListDeleteEndFinish)
                + " Milliseconds");

        // Delete 1000 elements from the end of LinkedList

        LocalDateTime linkedListDeleteEndStart = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() - 1000 + i);
        }

        LocalDateTime linkedListDeleteEndFinish = LocalDateTime.now();

        // print on console a time interval for process above

        System.out.println("To delete 1000 elements from the end" +
                " of LinkedList needs " + ChronoUnit.MILLIS.between
                (linkedListDeleteEndStart,linkedListDeleteEndFinish)
                + " Milliseconds");

    }
}

/* ----------My Output---------------

--Lists Creations--
Time for creating Array List is 430 Milliseconds
Time for creating Linked List is 165 Milliseconds

--Insert new 1000 elements on the beginning--
To add 1000 elements in beginning of ArrayList needs 205 Milliseconds
To add 1000 elements in beginning of LinkedList needs 1 Milliseconds

--Insert  new 1000 elements on the middle--
To add 1000 elements in the middle of ArrayList needs 69 Milliseconds
To add 1000 elements in the middle of LinkedList needs 1612 Milliseconds

--Insert  new 1000 elements on the end--
To add 1000 elements in the end of ArrayList needs 4 Milliseconds
To add 1000 elements in the end of LinkedList needs 0 Milliseconds

--Update 1000 elements from the beginning--
To update 1000 elements from the beginning of ArrayList needs 3 Milliseconds
To update 1000 elements from the beginning of LinkedList needs 30 Milliseconds

--Update 1000 elements  on the  middle--
To update 1000 elements from the middle of ArrayList needs 8 Milliseconds
To update 1000 elements from the middle of ArrayList needs 695 Milliseconds

--Update 1000 elements  on the  end--
To update 1000 elements from the end of LinkedList needs 8 Milliseconds
To update 1000 elements from the end of LinkedList needs 11 Milliseconds

--Delete 1000 elements from the  beginning--
To delete 1000 elements from the beginning of ArrayList needs 103 Milliseconds
To delete 1000 elements from the beginning of LinkedList needs 5 Milliseconds

--Delete 1000 elements from the  middle--
To delete 1000 elements from the middle of ArrayList needs 40 Milliseconds
To delete 1000 elements from the middle of LinkedList needs 738 Milliseconds

--Delete 100 elements from the  end--
To delete 1000 elements from the end of ArrayList needs 0 Milliseconds
To delete 1000 elements from the end of LinkedList needs 2 Milliseconds

Process finished with exit code 0

 */