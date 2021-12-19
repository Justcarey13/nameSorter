
## The Goal 
### Build a name sorter. 
  Given a set of names, order that set first by last name, then by any given names the person may have.
  
  A name must have at least 1 given nameand may have up to 3 given names.
  
## Example Usage

Given a a file called unsorted-names-list.txt containing the following list of names

    Janet Parsons
    Vaughn Lewis
    Adonis Julius Archer
    Shelby Nathan Yoder
    Marin Alvarez
    London Lindsey
    Beau Tristan Bentley
    Leo Gardner
    Hunter Uriah Mathew Clarke
    Mikayla Lopez
    Frankie Conner Ritter

Executing the program in the following way

    javac nameSorter.java 
    java nameSort unsorted-names-list.txt

Should result the sorted names to screen

    Marin Alvarez
    Adonis Julius Archer
    Beau Tristan Bentley
    Hunter Uriah Mathew Clarke
    Leo Gardner
    Vaughn Lewis
    London Lindsey
    Mikayla Lopez
    Janet Parsons
    Frankie Conner Ritter
    Shelby Nathan Yoder

and a file in the working directory called sorted-names-list.txt containing the sorted names.

## Program Description 
This program is a simple name sorter consisting of 3 classes:
- Person -> A person has a last name and 1-3 given name(s).
- PersonComparator -> Order is sort last name first then any given name(s).
- nameSorter -> read unsortedList then write sortedList in sorted-names-list.txt

## Testing
Simple unit tests 
