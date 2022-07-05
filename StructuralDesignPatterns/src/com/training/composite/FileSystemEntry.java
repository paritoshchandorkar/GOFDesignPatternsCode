package com.training.composite;

public abstract class FileSystemEntry {
		abstract void copy(String destinationFolder);
		abstract void rename(String newName);
    	abstract void add(FileSystemEntry entry) ;
    	
}
