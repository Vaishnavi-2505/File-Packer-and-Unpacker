# File-Packer-and-Unpacker Application

 Author : Vaishnavi Shingare

 
 Created On : 21/07/2025

 
 Language : Java  Input : Files from a directory (Packer), Packed file (Unpacker)
 
 
 Output : Single packed file (Packer), Multiple extracted files (Unpacker)
 

# Project Overview

This project is a Java-based file utility tool that provides functionality for packing
multiple files into a single archive and unpacking them back with all metadata
preserved.

To enhance security, the packed file is encrypted, and only authorized users can decrypt &
extract the data.

The project also features a Graphical User Interface (GUI) for user-friendly interaction.

# Key Features

- File Packing
- Combines multiple regular files into a single archive file.
- Stores metadata (file name, size, timestamp) along with file content.
- File Unpacking
- Extracts individual files from the packed archive.
- Restores all original metadata and file structure.
- Data Security
- Built-in encryption and decryption to protect packed files.
- Graphical User Interface (GUI)
- User-friendly GUI built in Java (Swing).
- Provides simple options for selecting files, encrypting, packing, and unpacking.
- Cross-platform
- Runs seamlessly on any system with a Java Runtime Environment (JRE).

# PACKER DETAILS
> Class Name: MarvellousPacker
> Entry Point: Packer.java

### Functionality:

- Accepts a directory name and a target packed file name
- Reads all files from the directory
- Creates a 100-byte header for each file:
  
"filename filesize" (padded with spaces)
- Writes the header and file data to the packed file
- Prints progress and a summary report
  
# UNPACKER DETAILS
> Class Name: MarvellousUnpacker
> Entry Point: Unpacker.java

### Functionality:

- Accepts a packed file name
- Reads 100-byte headers and extracts file names and sizes
- Writes the corresponding file data to new files
- Prints progress and a summary report
