package FlightTime;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AeroportMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
}
