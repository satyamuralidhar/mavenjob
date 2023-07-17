def call(string username,string imagetag,string imagename){
    docker build -t ${imagename}:${imagetag} .
    docker tag ${imagename}:${imagetag} ${username}/${imagename}:${imagetag}
}