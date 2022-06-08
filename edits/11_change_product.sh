
git grep -l 'mesolab.product' | grep -v '^edits\/' | sort -u > ./edits/product_content.list

while read it ; do sed --in-place 's/mesolab.product/mesolab.symcps/' ${it} ; done < ./edits/product_content.list
