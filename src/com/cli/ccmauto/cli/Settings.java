package com.cli.ccmauto.cli;

import com.beust.jcommander.Parameter;

public class Settings {
	
	@Parameter(names = "-h", help=true, description="list available commands")
    public boolean help;
}