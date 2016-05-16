/**
 * Copyright 2012 Alexey Ragozin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gridkit.vicluster.telecontrol;

import java.io.File;
import java.io.InputStream;

public interface FileBlob {
	
	/**
	 * Method returns file path if blob is file based or <code>null</code> otherwise.
	 * File may be a directory (in later case binary content will represent archived content of directory). 
	 */
	public File getLocalFile();
	
	public String getFileName();
	
	/**
	 * Cache does not care about hashing algorithm.
	 * @return
	 */
	public String getContentHash();
	
	public InputStream getContent();

	public long size();
	
}
