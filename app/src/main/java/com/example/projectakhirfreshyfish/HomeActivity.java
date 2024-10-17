package com.example.projectakhirfreshyfish;

public class FishAdapter extends RecyclerView.Adapter<FishAdapter.FishViewHolder> {

    private List<Fish> fishList;

    public FishAdapter(List<Fish> fishList) {
        this.fishList = fishList;
    }

    @NonNull
    @Override
    public FishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fish_card_item, parent, false);
        return new FishViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FishViewHolder holder, int position) {
        Fish fish = fishList.get(position);
        holder.fishName.setText(fish.getName());
        holder.fishDescription.setText(fish.getDescription());
        holder.fishPrice.setText(fish.getPrice());
        holder.fishImage.setImageResource(fish.getImageResId());
    }

    @Override
    public int getItemCount() {
        return fishList.size();
    }

    public static class FishViewHolder extends RecyclerView.ViewHolder {
        ImageView fishImage;
        TextView fishName, fishDescription, fishPrice;

        public FishViewHolder(@NonNull View itemView) {
            super(itemView);
            fishImage = itemView.findViewById(R.id.fish_image);
            fishName = itemView.findViewById(R.id.fish_name);
            fishDescription = itemView.findViewById(R.id.fish_description);
            fishPrice = itemView.findViewById(R.id.fish_price);
        }
    }
}
