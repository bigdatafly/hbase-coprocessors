/**
 * 
 */
package com.bigdatafly.hbase.coprocessors;

import org.apache.hadoop.hbase.Coprocessor;
import org.apache.hadoop.hbase.coprocessor.BaseRowProcessorEndpoint;
import org.apache.hadoop.hbase.coprocessor.CoprocessorService;
/**
 * @author summer
 *
 */
public class RowCountEndpoint extends BaseRowProcessorEndpoint 
	implements Coprocessor, CoprocessorService{

}
