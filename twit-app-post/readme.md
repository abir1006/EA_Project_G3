Got it! Here's the `README.md` file with the requested style and formatting:

```markdown
# Deployment Manual for Spring Boot Application using Kubernetes (k8s) and Docker

### Creating Package File of Spring Boot Application

1. **Clean and Package the Application**

   To clean and package your Spring Boot application, run:

   ```sh
   mvn clean package
   ```

### Building Docker Image

2. **Build the Docker Image**

   Build the Docker image for the application with the following command:

   ```sh
   docker build . -t twit-app:1.0
   ```

### Running Docker Container

3. **Run the Docker Container**

   Start the Docker container and map port 8080 on your host to port 8080 in the container:

   ```sh
   docker run -p 8080:8080 twit-app:1.0
   ```

### Tagging and Pushing Docker Image

4. **Tag and Push the Docker Image**

   Tag your Docker image and push it to your Docker repository:

   ```sh
   docker tag twit-app:1.0 <docker-id>/twit-app:1.0
   docker push <docker-id>/twit-app:1.0
   ```

### Deploying to Kubernetes

5. **Apply Kubernetes Deployment**

   Deploy your application to Kubernetes using the deployment configuration included in this source file in root dir:

   ```sh
   kubectl apply -f deployment.yaml
   ```

6. **Apply Kubernetes Service**

   Create a service to expose your application:

   ```sh
   kubectl apply -f service.yaml
   ```

7. **Load Image in Minikube**

   Load the Docker image into Minikube:

   ```sh
   minikube image load twit-app:1.0
   ```

### Verifying and Accessing the Application

8. **Verify Kubernetes Resources**

   Check the status of all Kubernetes resources:

   ```sh
   kubectl get all
   ```

9. **Access the Application**

   Get the URL for your application service:

   ```sh
   minikube service twit-k8s-service --url
   ```

10. **Set Up Minikube Tunnel**

    Start Minikube tunnel to expose services:

    ```sh
    minikube tunnel
    ```

11. **Open Minikube Dashboard**

    Access the Minikube dashboard for a graphical view of your Kubernetes cluster:

    ```sh
    minikube dashboard
    ```

```