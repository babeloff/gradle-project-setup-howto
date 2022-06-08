
git ls-files --directory | while read file; do echo ./$(dirname ${file}) ; done | sort -u | grep '\/org\/example\/' | sed 's|org/example/.*||g' > ./edits/org_example_dirs.list0

mv ./edits/org_example_dirs.list0 ./edits/org_example_dirs.list

while read it ; do rmdir ${it}edu/vanderbilt/isis/mesolab ; done < ./edits/org_example_dirs.list
while read it ; do git mv ${it}org/example ${it}edu/vanderbilt/isis/mesolab ; done < ./edits/org_example_dirs.list


