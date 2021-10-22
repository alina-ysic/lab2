package FlightTime;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.lib.MultipleInputs;
import org.apache.hadoop.mapreduce.Job;

import java.io.IOException;

public class FlightTimeApp {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("Usage: FlightTimeApp <path> <path>");
            System.exit(-1);
        }
        Job job = Job.getInstance();
        job.setJarByClass(FlightTimeApp.class);
        job.setJobName("Flight Time");
        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, mapper);
        MultipleInputs.addInputPath(job, new Path(args[1]), TextInputFormat.class, mapper);
    }

}
