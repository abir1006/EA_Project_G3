
# This is a manual for deploying the springboot app using Kubernetes a.k.a k8s and docker. 

* Creating package file of springboot
mvn clean package

### Building docker image using docker file
docker build -t twit-app-k8s-demo:1.0 .
### Deploy the docker image of the app with K8s
kubectl create deployment twit-app-deployment-k8s --image=twit-app-k8s-demo:1.0 --port=8080

### Load Images from docker to minikube 
minikube image load twit-app-k8s-demo:1.0

### Checking the deployment 
kubectl get deployments

### Check status of pod
kubectl get pods

# Run the pod with logs
kubectl logs twit-app-deployment-k8s-5f54c7cd45-5hrwl

# Creating service 
kubectl expose deployment twit-app-deployment-k8s --type=NodePort

Kubectl get service

# accessing the pod from outside  (<service name>)
minikube service twit-app-deployment-k8s --url
--service name--



