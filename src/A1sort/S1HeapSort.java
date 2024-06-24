//////package A1sort;
//////
//////import java.util.Arrays;
//////import java.util.concurrent.atomic.AtomicReference;
//////
//////// 종료로직 : heapify가 일어나지 않으면
//////public class S1HeapSort {
//////    public static void main(String[] args) {
//////        int arr[] = {7, 6, 5, 8, 3, 5, 9, 1, 6};
//////        heapSort(arr);
//////        System.out.println(Arrays.toString(arr));
//////    }
//////
//////    public static void heapSort(int arr[]) {
//////        int n = arr.length -1;
//////
//////        for (int i = n / 2 - 1; i > 0; i--) {
//////            heapify(arr, i, n);
//////        }
//////        for (int i = n - 1; i > 0; i--) {
//////            swap(arr, i, 0);
//////            heapify(arr, 0, i);
//////        }
//////    }
//////
//////    public static void heapify(int arr[], int n, int i) {
//////        int parent = i;
//////        int leftChild = (i * 2) + 1;
//////        int rightChild = (i * 2) + 2;
////////        왼쪽 노드가 배열의 길이보다 짧아야
//////        if (leftChild > n && arr[parent] > arr[leftChild]) {
//////            parent = leftChild;
//////        }
//////        오른쪽 노드가 배열의 길이보다 짧아여
//////        if (rightChild > n && arr[parent] > arr[rightChild]) {
//////            parent = rightChild;
//////        }
//////        parent가 leftChild와 right 세개중 가장 작은 node로 다시 heapify
//////        if (parent != i) {
//////            swap(arr, n, parent);
//////            heapify(arr, parent, i);
//////        }
//////    }
//////
//////    //  문제없음
//////    public static void swap(int arr[], int n, int parent) {
//////        int temp = arr[parent];
//////        arr[parent] = arr[n];
//////        arr[n] = temp;
//////    }
//////}
////
//package A1sort;
//
//import java.util.Arrays;
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.concurrent.atomic.AtomicReference;
//
//// 종료로직 : heapify가 일어나지 않으면
//public class S1HeapSort {
//    public static void main(String[] args) {
//        int arr[] = {7, 6, 5, 8, 3, 5, 9, 1, 6};
//
////        최초힙구성
//        for (int i = arr.length / 2 - 1; i >= 0; i--) {
//            heapify(arr, arr.length - 1, i);
//        }
////        루트노트와 최하위노드를 change하면서 heapify
//        for (int i = arr.length - 1; i >= 0; i--) {
//            int temp = arr[i];
//            arr[i] = arr[0];
//            arr[0] = temp;
//            heapify(arr, i-1, 0);
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void heapify(int arr[], int arrLength, int node) {
//        int left = node * 2 + 1;
//        int right = node * 2 + 2;
//
//        if (left > arrLength) return;
//
//        if (right > arrLength) {
////            node랑 left랑 비교
//            if (arr[node] > arr[left]) {
//                int temp = arr[node];
//                arr[node] = arr[left];
//                arr[left] = temp;
//                heapify(arr, arrLength, left);
//            }
//        } else {
////            node, left, right 모두 비교
//            int index = 0;
//            if (arr[node] > arr[left] || arr[node] > arr[right]) {
//                if (arr[left] > arr[right]) {
//                    index = right;
//                } else {
//                    index = left;
//                }
//                int temp = arr[node];
//                arr[node] = arr[index];
//                arr[index] = temp;
//                heapify(arr, arrLength, index);
//            }
//        }
//        int arr2[] = {7, 6, 5, 8, 3, 5, 9, 1, 6};
//        Queue<Integer> pq = new PriorityQueue<>();
//        for(int a : arr2) {
//            pq.add(a);
//        }
//        System.out.println(pq);
//    }
//}
////
////package A1sort;
////
////import java.util.Arrays;
////import java.util.concurrent.atomic.AtomicReference;
////
////// 종료로직 : heapify가 일어나지 않으면
////public class S1HeapSort {
////    public static void main(String[] args) {
////        int arr[] = {7, 6, 5, 8, 3, 5, 9, 1, 6};
////        heapSort(arr);
////        System.out.println(Arrays.toString(arr));
////    }
////
////    public static void heapSort(int arr[]) {
////        int n = arr.length -1;
////
////        for (int i = n / 2 - 1; i > 0; i--) {
////            heapify(arr, i, n);
////        }
////        for (int i = n - 1; i > 0; i--) {
////            swap(arr, i, 0);
////            heapify(arr, 0, i);
////        }
////    }
////
////    public static void heapify(int arr[], int n, int i) {
////        int parent = i;
////        int leftChild = (i * 2) + 1;
////        int rightChild = (i * 2) + 2;
//////        왼쪽 노드가 배열의 길이보다 짧아야
////        if (leftChild > n && arr[parent] > arr[leftChild]) {
////            parent = leftChild;
////        }
//////        오른쪽 노드가 배열의 길이보다 짧아여
////        if (rightChild > n && arr[parent] > arr[rightChild]) {
////            parent = rightChild;
////        }
//////        parent가 leftChild와 right 세개중 가장 작은 node로 다시 heapify
////        if (parent != i) {
////            swap(arr, n, parent);
////            heapify(arr, parent, i);
////        }
////    }
////
////    //  문제없음
////    public static void swap(int arr[], int n, int parent) {
////        int temp = arr[parent];
////        arr[parent] = arr[n];
////        arr[n] = temp;
////    }
////}
package A1sort;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

// 종료로직 : heapify가 일어나지 않으면
public class S1HeapSort {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        int arr[] = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int k = 3;
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
            System.out.println(pq.peek());

        }
    }
}

