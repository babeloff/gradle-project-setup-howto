
git grep -l 'org.example' | grep -v '^edits\/' | sort -u > ./edits/org_example_content.list

while read it ; do sed --in-place 's/org.example/edu.vanderbilt.isis.mesolab' ${it} ; done < ./edits/org_example_content.list
