package co.edu.unbosque.util;

import java.util.ArrayList;

import co.edu.unbosque.model.ConceptoDTO;

public class MergeSort {

    /*Une dos subarrays de arr[]
    Primer subarray es arr[1...m]
    Segundo subarray es arr[m+1..r]*/
    public static ArrayList<ConceptoDTO> merge(ArrayList<ConceptoDTO> list, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        ArrayList<ConceptoDTO> L = new ArrayList<>();
        ArrayList<ConceptoDTO> R = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
        	L.add(list.get(l + i));
        }
        for (int j = 0; j < n2; j++) {
        	R.add(list.get(m + 1 + j));
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L.get(i).getPalabra().compareTo(R.get(j).getPalabra()) <= 0) {
                list.set(k, L.get(i));
                i++;
            } else {
            	list.set(k, R.get(j));
                j++;
            }
            k++;
        }
        while (i < n1) {
        	list.set(k, L.get(i));
            i++;
            k++;
        }
        while (j < n2) {
        	list.set(k, R.get(j));
            j++;
            k++;
        }
        return list;
    }

    public static ArrayList<ConceptoDTO> sort(ArrayList<ConceptoDTO> list, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(list, l, m);
            sort(list, m + 1, r);
            return merge(list, l, m, r);
        }
        return list;
    }
}