
find . -path '*/org/example' | grep -v 'build' | sed 's|org/example||g' > ./edits/org_example_dirs.list

while read it ; do mkdir -p ${it}edu/vanderbilt/isis/mesolab ; done < ./edits/org_example_dirs.list
while read it ; do mv ${it}org/example/* ${it}edu/vanderbilt/isis/mesolab/ ; done < ./edits/org_example_dirs.list 
while read it ; do rm -rf ${it}org ; done < ./edits/org_example_dirs.list 

while read it ; do git add ${it}edu ; done < ./edits/org_example_dirs.list 


