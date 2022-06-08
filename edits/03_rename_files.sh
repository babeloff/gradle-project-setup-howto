
find . -name 'org.example.*' | grep -v 'build' | sed 's/org.example/  /' > ./edits/org_example_files.list

while read pre post ; do mv ${pre}org.example${post}  ${pre}edu.vanderbilt.isis.mesolab${post} ; done < ./edits/org_example_files.list

while read pre post ; do git add  ${pre}edu.vanderbilt.isis.mesolab${post} ; done < ./edits/org_example_files.list
