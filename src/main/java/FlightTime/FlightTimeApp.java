package FlightTime;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class FlightTimeApp {
    public static void main(String[] args) throws IOException {
        /*if (args.length != 3) {
            System.err.println("Usage: FlightTimeApp <path> <path>");
            System.exit(-1);
        }*/
        Job job = Job.getInstance();
        job.setJarByClass(FlightTimeApp.class);
        job.setJobName("Flight Time");
        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, FlightMapper.class);
        MultipleInputs.addInputPath(job, new Path(args[1]), TextInputFormat.class, AirportMapper.class);
        //FileOutputFormat.setOutputPath(job, new Path(args[2]));
        //job.setPartitionerClass(TextPair.FirstPartitioner.class);
        //job.setGroupingComparatorClass(TextPair.FirstComparator.class);
        //job.setReducerClass(JoinReducer.class);
        //job.setMapOutputKeyClass(TextPair.class);
        //job.setOutputKeyClass(Text.class);
        //job.setOutputValueClass(Text.class);
        //job.setNumReduceTasks(2);
        //System.exit(job.waitForCompletion(true) ? 0 : 1);
    }

}
