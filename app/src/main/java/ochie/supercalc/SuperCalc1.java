package ochie.supercalc;

import java.util.ArrayList;

class SuperCalc1 extends SuperCalc0 {
  String compute(ArrayList<String> args, ArrayList<String> ops) {
    return doMultiplications(args, ops);
  }

  String doMultiplications(ArrayList<String> args, ArrayList<String> ops) {
    int opIndex = ops.indexOf("/");
    if (opIndex < 0) {
      opIndex = ops.indexOf("*");
      if (opIndex < 0) return doAdditions(args, ops);
      else {
        String arg1 = args.get(opIndex);
        String arg2 = args.get(opIndex + 1);
        args.remove(opIndex);
        args.remove(opIndex);
        args.add(opIndex, String.valueOf(Integer.parseInt(arg1) * Integer.parseInt(arg2)));
        ops.remove(opIndex);
      }
    } else {
      String arg1 = args.get(opIndex);
      String arg2 = args.get(opIndex + 1);
      args.remove(opIndex);
      args.remove(opIndex);
      args.add(opIndex, String.valueOf(Integer.parseInt(arg1) / Integer.parseInt(arg2)));
      ops.remove(opIndex);
    }

    return doAdditions(args, ops);
  }

  String doAdditions(ArrayList<String> args, ArrayList<String> ops) {
    int opIndex = ops.indexOf("-");
    if (opIndex < 0) {
      opIndex = ops.indexOf("+");
      if (opIndex < 0) return args.get(0);
      else {
        String arg1 = args.get(opIndex);
        String arg2 = args.get(opIndex + 1);
        args.remove(opIndex);
        args.remove(opIndex);
        args.add(opIndex, String.valueOf(Integer.parseInt(arg1) + Integer.parseInt(arg2)));
        ops.remove(opIndex);
      }
    } else {
      String arg1 = args.get(opIndex);
      String arg2 = args.get(opIndex + 1);
      args.remove(opIndex);
      args.remove(opIndex);
      args.add(opIndex, String.valueOf(Integer.parseInt(arg1) - Integer.parseInt(arg2)));
      ops.remove(opIndex);
    }
    return doAdditions(args, ops);
  }
}
