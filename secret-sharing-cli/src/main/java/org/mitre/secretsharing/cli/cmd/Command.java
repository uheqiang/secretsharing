/*

Copyright 2015 The MITRE Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

This project contains content developed by The MITRE Corporation. If this 
code is used in a deployment or embedded within another project, it is 
requested that you send an email to opensource@mitre.org in order to let 
us know where this software is being used.

 */

package org.mitre.secretsharing.cli.cmd;

import java.io.InputStream;
import java.io.PrintStream;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public interface Command {

	public String getName();
	
	public String getDescription();
	
	public Options getOptions();
	
	public CommandLine parse(String... args) throws ParseException;
	
	public void perform(CommandLine cmd, InputStream in, PrintStream out, PrintStream err) throws Exception;
	
	public void showHelp(PrintStream out);

}