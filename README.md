# Network-Programming
# 🌐 Network Programming Lab (RTU 4th Semester)

This repository contains all practical experiments and programs for **Network Programming Lab** as per the **Rajasthan Technical University (RTU) 4th Semester syllabus**.

It covers fundamental networking concepts, configurations, and implementation of protocols using C programming and simulation tools.

---

## 📌 Objectives

- Understand basic networking concepts and architectures  
- Learn different network topologies and configurations  
- Implement client-server communication using TCP & UDP  
- Explore error detection and correction techniques  
- Simulate routing algorithms  

---

## 🧪 List of Experiments

### 🔹 1. Study of LAN & Network Equipments
- Overview of LAN technologies  
- Devices: Router, Switch, Hub, Bridge, Modem  
- Understanding their roles in networking  

---

### 🔹 2. Network Topologies Verification
- Star Topology  
- Bus Topology  
- Ring Topology  
- Mesh & Hybrid Topologies  

---

### 🔹 3. LAN Installation & Configuration
- Setting up LAN connection  
- IP configuration  
- Network troubleshooting basics  

---

### 🔹 4. Error Detection & Correction Techniques
- Implementation of:
  - Parity Check  
  - Checksum  
  - Hamming Code  
  - CRC (Cyclic Redundancy Check)  

---

### 🔹 5. Framing Methods Implementation
- Character Count Method  
- Byte Stuffing  
- Bit Stuffing  

---

### 🔹 6. TCP Client-Server Program (C)

#### 📥 Server (hello_server)
- Listens for incoming TCP connection  
- Accepts one client  
- Reads data and prints to console  
- Closes connection  

#### 📤 Client (hello_client)
- Connects to server  
- Sends message: `"Hello, world!"`  
- Closes connection  

---

### 🔹 7. TCP Echo Client-Server (RTT Calculation)
- Server handles multiple clients  
- Echoes back received messages  
- Client calculates **Round Trip Time (RTT)**  

---

### 🔹 8. UDP Client-Server Programs
- Repeat:
  - Hello Client-Server  
  - Echo Client-Server  
- Using **UDP protocol (connectionless communication)**  

---

### 🔹 9. Multiplexed I/O (Advanced TCP)
- Handling multiple clients simultaneously  
- Using:
  - `select()` system call  
- Efficient server design  

---

### 🔹 10. Bellman-Ford Routing Algorithm (NS2)
- Simulation using **NS2 (Network Simulator 2)**  
- Shortest path calculation  
- Distance vector routing  

---

## 🛠️ Technologies Used

- **C Programming**
- **Socket Programming (TCP & UDP)**
- **NS2 Simulator**
- **Linux / Unix Environment**

---

## 📂 Project Structure
Network-Programming-Lab/  
│  
├── Experiment-1_LAN_Study/  
├── Experiment-2_Topologies/  
├── Experiment-3_LAN_Config/  
├── Experiment-4_Error_Control/  
├── Experiment-5_Framing/  
├── Experiment-6_TCP_Hello/  
├── Experiment-7_TCP_Echo/  
├── Experiment-8_UDP/  
├── Experiment-9_Multiplexing/  
├── Experiment-10_BellmanFord_NS2/  
│  
└── README.md  


---

## 🚀 How to Run (Example for C Programs)

```bash
gcc server.c -o server
gcc client.c -o client

./server
./client
---
📚 Learning Outcomes
Practical understanding of networking concepts
Hands-on experience with socket programming
Knowledge of TCP/UDP communication
Ability to simulate routing algorithms
---
🤝 Contributing

Contributions are welcome!

If you'd like to improve this repository:

Fork the repository
Create a new branch
Make your changes
Submit a Pull Request
---
📜 License

This project is for educational purposes only.
---

👨‍💻 Author

Ronit Raj
B.Tech CSE Student | RTU
Passionate about Programming & Development 🚀
