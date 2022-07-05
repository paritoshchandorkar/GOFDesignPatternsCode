package com.training.composite;

import java.util.ArrayList;
import java.util.Collection;

public class Folder extends FileSystemEntry {
	
	private Collection<FileSystemEntry> entries = new ArrayList<FileSystemEntry>();

	public Folder(String name){
		System.out.println("Inside folder"+name);
	}
	
	@Override
	void copy(String destinationFolder) {
		for (FileSystemEntry file : entries) {
			file.copy(destinationFolder);
		}

	}

	@Override
	void rename(String newName) {
		System.out.println("folder:rename");

	}

	@Override
	void add(FileSystemEntry entry) {
		entries.add(entry);
	}

}
