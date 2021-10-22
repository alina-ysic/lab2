package lab2;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportMapper extends Mapper<Text, Text, Text, Text> {
    @Override
    protected void map(Text key, Text value, Mapper<Text, Text, Text, Text>.Context context) throws IOException, InterruptedException {
        System.out.println("A " + key);
        context.write(new Text("a"), new Text("2"));
        super.map(key, value, context);
    }
}
