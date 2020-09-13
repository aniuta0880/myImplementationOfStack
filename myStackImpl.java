class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NrOfTasks = sc.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> stackMaximum = new ArrayDeque<>();
        for(int i=0;i<NrOfTasks;i++) {
            String action = sc.next();
            switch(action) {
                case "pop" :{
                    stack.pollLast();
                    stackMaximum.pollLast();
                    break;
                }
                case "push" :{
                    int val = sc.nextInt();
                    stack.offerLast(val);
                    int max = Math.max(val,stackMaximum.size()==0 ? val : stackMaximum.peekLast());
                    stackMaximum.offerLast(max);
                    break;
                }
                case "max" :{
                    System.out.println(stackMaximum.peekLast());
                    break;
                }
                default:{
                    System.out.println("Check your input");
                    break;
                }
            }
        }
    }
}