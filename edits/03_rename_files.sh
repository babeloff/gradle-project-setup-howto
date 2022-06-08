
git ls-files | grep 'org\.example' | sed 's/org\.example/  /' | sort -u > ./edits/03_org_example_files.list

while read pre post ; do git mv ${pre}org.example${post}  ${pre}edu.vanderbilt.isis.mesolab${post} ; done < ./edits/03_org_example_files.list
