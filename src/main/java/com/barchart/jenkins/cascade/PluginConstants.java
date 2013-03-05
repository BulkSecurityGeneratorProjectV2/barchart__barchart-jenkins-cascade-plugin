/**
 * Copyright (C) 2013 Barchart, Inc. <http://www.barchart.com/>
 *
 * All rights reserved. Licensed under the OSI BSD License.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package com.barchart.jenkins.cascade;

/**
 * Plug-in constants.
 * 
 * @author Andrei Pozolotin
 */
public interface PluginConstants {

	/* Plugin */

	String PLUGIN_NAME = "Barchart Cascade Release Plugin";
	String PLUGIN_URL = "/plugin/barchart-jenkins-cascade-plugin";

	/* Cascade project. */
	String CASCADE_PROJECT_PRONOUN = "Cascade";
	String CASCADE_PROJECT_NAME = "Cascade Project";

	/* Layout project. */

	String LAYOUT_ACTION_NAME = "Cascade Layout";
	String LAYOUT_ACTION_URL = "barchart-cascade-layout";
	String LAYOUT_ACTION_ICON = PLUGIN_URL + "/images/48x48/monkey.png";

	/* Member projects. */

	String MEMBER_ACTION_NAME = "Cascade Release";
	String MEMBER_ACTION_URL = "barchart-cascade-release";
	String MEMBER_ACTION_ICON = PLUGIN_URL + "/images/48x48/dragon.png";

	String LOGGER_PREFIX = "[CASCADE]";

}
