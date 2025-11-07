//Program to demonstrate Database MetaData and ResultSet Metadata
package com.Charan.tnsif.day24.client;

import com.Charan.tnsif.day24.metadata.DBMetadata;

public class MetaDataDemo {

	public static void main(String[] args) {
		DBMetadata.showDatabaseMetataData();
		DBMetadata.showRSMetadata();

	}

}
