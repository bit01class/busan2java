package com.bit;
//박재현,박진우,강지우,박태영
//문자열: 김민수,박주은,차원학
class Stu{}
class Arr{
	private int[] arr=new int[0];
	
	void removeItem(int item) {
		int idx=-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==item) {
				idx=i;
				break;
			}
		}
		if(idx!=-1) {
			remove(idx);
		}
	}
	
	void remove(int idx) {
		int[] arr2=new int[arr.length-1];
		for(int i=0; i<idx; i++) {
			arr2[i]=arr[i];
		}
		for(int i=idx+1; i<arr.length; i++) {
			arr2[i-1]=arr[i];
		}
		arr=arr2;
	}
	int size() {
		return arr.length;
	}
	int get(int idx) {
		return arr[idx];
	}
	void add(int su) {
		int[] arr2=new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			arr2[i]=arr[i];
		}
		arr2[arr2.length-1]=su;
		arr=arr2;
	}
}

public class Ex08 {

	public static void main(String[] args) {
		Arr arr=new Arr();
		arr.add(1111);
		arr.add(2222);
		arr.add(3333);
		arr.add(4444);
		arr.removeItem(55555);
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
