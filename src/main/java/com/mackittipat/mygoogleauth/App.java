package com.mackittipat.mygoogleauth;

import com.mackittipat.mygoogleauth.job.InitJob;
import com.mackittipat.mygoogleauth.job.RunJob;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.jboss.aerogear.security.otp.Totp;
import org.yaml.snakeyaml.Yaml;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class App {


    public static void main( String[] args ) {

        Options options = new Options();
        options.addOption("i", "init", false, "init password");
        options.addOption("r", "run", true, "run the application");

        CommandLineParser parser = new DefaultParser();
        try {

            CommandLine cmd = parser.parse(options, args);

            //init data
            if(cmd.hasOption("i")){
                InitJob.init();
            }

            //getting the otp job
            if(cmd.hasOption("r")){
                RunJob.run(cmd.getOptionValue("r"));
            }


        } catch (ParseException e) {
            System.out.println("Can not parse parameter");
        }



    }
}
