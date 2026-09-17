import java.util.*;
public class Solution {
    public int kthSmallest(int[] a, int k) {
        int left=0,right=a.length-1,target=k-1;
        Random random=new Random(1);
        while (left<=right) {
            int pivot=a[left+random.nextInt(right-left+1)], lt=left, i=left, gt=right;
            while(i<=gt){ if(a[i]<pivot) swap(a,lt++,i++); else if(a[i]>pivot) swap(a,i,gt--); else i++; }
            if(target<lt) right=lt-1; else if(target>gt) left=gt+1; else return pivot;
        }
        throw new IllegalArgumentException();
    }
    private void swap(int[] a,int i,int j){int t=a[i];a[i]=a[j];a[j]=t;}
}