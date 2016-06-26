/**
 * 
 */
package com.bigdatafly.hbase.coprocessors;

import java.io.IOException;

import org.apache.hadoop.hbase.filter.Filter;

/**
 * @author summer
 *
 */
public interface RowCountProtocol {

	long getRowCount() throws IOException;
	
	long getRowCount(Filter filter) throws IOException;
	
	long getKeyValueCount() throws IOException;
}
