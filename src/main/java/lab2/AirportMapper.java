package lab2;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportMapper extends Mapper<LongWritable, LongWritable, Text, Text> {
    @Override
    protected void map(LongWritable key, LongWritable value, Mapper<LongWritable, LongWritable, Text, Text>.Context context) throws IOException, InterruptedException {
        System.out.println("A " + key);
        context.write(new Text("a"), new Text("2"));
        super.map(key, value, context);
    }
}
