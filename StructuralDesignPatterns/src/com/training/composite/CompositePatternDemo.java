package com.training.composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		FileSystemEntry folderParent = new Folder("Parent Folder");
		
		
		FileSystemEntry file1 = new File("First File");
		folderParent.add(file1);
		
		
		FileSystemEntry folderChild1 = new Folder("Child Folder");
		folderParent.add(folderChild1);
		
		FileSystemEntry file2 = new File("Second file");
		folderChild1.add(file2);
		
	}

}
