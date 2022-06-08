
git ls-files --directory | while read file; do echo ./$(dirname ${file}) ; done | sort -u | grep '\/mesolab\/product\/' | sed 's|mesolab/product/.*|mesolab/|g' > ./edits/12_product_dirs.list

while read it ; do git mv ${it}product ${it}symcps ; done < ./edits/12_product_dirs.list


