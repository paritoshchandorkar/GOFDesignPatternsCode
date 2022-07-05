package com.training.composite;

public class File extends FileSystemEntry {
	public File(String fileName){
		System.out.println(" Inside File "+fileName);
	}
	@Override
	void copy(String destinationFolder) {
		System.out.println("File.copy");

	}

	@Override
	void rename(String newName) {
		System.out.println("File.rename");

	}

	@Override
	void add(FileSystemEntry entry) {
		System.out.println("File.add");

	}
}
